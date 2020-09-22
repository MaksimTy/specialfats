-- Database: specialfats

DROP SCHEMA IF EXISTS tech CASCADE;
CREATE SCHEMA tech;

--DROP TABLE IF EXISTS tech.metrics CASCADE;
--DROP TABLE IF EXISTS tech.costElements CASCADE;
--DROP TABLE IF EXISTS tech.cost_elements_category CASCADE;

CREATE TABLE tech.metrics
(
    metrics_id       integer PRIMARY KEY,
    metrics_code     VARCHAR(5)
        CONSTRAINT uq_code_metrics UNIQUE     NOT NULL,
    metrics_name     VARCHAR(25)
        CONSTRAINT uq_name_metrics UNIQUE     NOT NULL,
    metrics_codename VARCHAR(25)
        CONSTRAINT uq_codename_metrics UNIQUE NOT NULL
);

CREATE TABLE tech.cost_elements_category
(
    cost_elements_category_id   integer PRIMARY KEY,
    cost_elements_category_name VARCHAR(25)
        CONSTRAINT uq_cost_elements_category_name UNIQUE NOT NULL
);

CREATE TABLE tech.cost_elements
(
    cost_elements_id       integer PRIMARY KEY,
    cost_elements_code     VARCHAR(10)
        CONSTRAINT uq_cost_elements_code UNIQUE NOT NULL,
    cost_elements_name     VARCHAR(50)
        CONSTRAINT uq_cost_elements_name UNIQUE NOT NULL,
    cost_elements_metrics  integer              NOT NULL,
    cost_elements_category integer              NOT NULL,
    CONSTRAINT fk_metrics_id FOREIGN KEY (cost_elements_metrics)
        REFERENCES tech.metrics (metrics_id)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_cost_elements_category_id FOREIGN KEY (cost_elements_category)
        REFERENCES tech.cost_elements_category (cost_elements_category_id)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE tech.product_group
(
    product_group_id       integer PRIMARY KEY,
    product_group_code     VARCHAR(10)
        CONSTRAINT uq_product_group_code UNIQUE NOT NULL,
    product_group_name     VARCHAR(50)
        CONSTRAINT uq_product_group_name UNIQUE NOT NULL,
    product_group_describe text
);

CREATE TABLE tech.product_line
(
    product_line_id            integer PRIMARY KEY,
    product_line_code          VARCHAR(10)
        CONSTRAINT uq_product_line_code UNIQUE NOT NULL,
    product_line_name          VARCHAR(50)
        CONSTRAINT uq_product_line_name UNIQUE NOT NULL,
    product_line_describe      text,
    product_line_product_group integer         NOT NULL,
    CONSTRAINT fk_product_group_id FOREIGN KEY (product_line_product_group)
        REFERENCES tech.product_group (product_group_id)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE tech.product_recipe
(
    product_recipe_id           integer NOT NULL,
    product_recipe_product_line integer NOT NULL,
    product_recipe_describe     text,
    CONSTRAINT fk_product_line_id FOREIGN KEY (product_recipe_product_line)
        REFERENCES tech.product_line (product_line_id)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT pkey_product_recipe PRIMARY KEY (product_recipe_id, product_recipe_product_line)
);

CREATE TABLE tech.material_quality_level
(
    quality_level_id   integer PRIMARY KEY,
    quality_level_code VARCHAR(10)
        CONSTRAINT uq_quality_level_code UNIQUE NOT NULL,
    quality_level_rank SMALLINT
        CONSTRAINT uq_quality_level_rank UNIQUE NOT NULL
);

CREATE TABLE tech.product_recipe_composed
(
    product_recipe_id                          integer NOT NULL,
    product_recipe_product_line                integer NOT NULL,
    product_recipe_cost_elements               integer NOT NULL,
    product_recipe_cost_elements_quality_level integer,
    product_recipe_composed_shape              real    NOT NULL,
    CONSTRAINT shape_check CHECK ( product_recipe_composed_shape <= 1 AND product_recipe_composed_shape > 0 ),
    CONSTRAINT pkey_product_recipe_composed PRIMARY KEY (
                                                         product_recipe_id,
                                                         product_recipe_product_line,
                                                         product_recipe_cost_elements),
    CONSTRAINT fk_product_recipe_id FOREIGN KEY (product_recipe_id, product_recipe_product_line)
        REFERENCES tech.product_recipe (product_recipe_id, product_recipe_product_line)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_cost_elements_id FOREIGN KEY (product_recipe_cost_elements)
        REFERENCES tech.cost_elements (cost_elements_id)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_quality_level_id FOREIGN KEY (product_recipe_cost_elements_quality_level)
        REFERENCES tech.material_quality_level (quality_level_id)
            MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)