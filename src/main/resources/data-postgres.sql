/*  */
INSERT INTO tech.metrics
(metrics_id,
 metrics_code,
 metrics_name,
 metrics_codename)
VALUES (168, '168', 't', 'TNE'),
       (166, '166', 'kg', 'KGM'),
       (6, '006', 'm', 'MTR'),
       (769, '796', 'pc', 'PCE'),
       (112, '112', 'l', 'LTR'),
       (55, '055', 'm2', 'MTK'),
       (18, '018', 'пог.м', 'ПОГ М');

/*  */
INSERT INTO tech.cost_elements_category
(cost_elements_category_id,
 cost_elements_category_name)
VALUES (1, 'row material'),
       (2, 'food additives'),
       (3, 'supporting material'),
       (4, 'packaging material'),
       (5, 'waste'),
       (6, 'transmix');

/*  */
INSERT INTO tech.cost_elements
(cost_elements_id,
 cost_elements_code,
 cost_elements_name,
 cost_elements_metrics,
 cost_elements_category)
VALUES (1000, '1000', 'Sun oil', 168, 1),
       (2000, '2000', 'Palm oil', 168, 1),
       (3000, '3000', 'Coconut oil', 168, 1),
       (7700, '7700', 'Cocoa', 168, 1),
       (3300, '3300', 'Soybean oil', 168, 1),
       (0010, '0010', 'Lecithin', 166, 2),
       (0100, '0100', 'Emulsifier', 166, 2);

/*  */
INSERT INTO tech.product_group
(product_group_id,
 product_group_code,
 product_group_name,
 product_group_describe)
VALUES (1, '00001', 'SDS', 'SDS describe'),
       (2, '00002', 'CB', 'CB describe'),
       (3, '00003', 'SDS-M', 'SDS-M describe'),
       (4, '00004', 'CREAM', 'CREAM describe');

/*  */
INSERT INTO tech.product_line
(product_line_id,
 product_line_code,
 product_line_name,
 product_line_describe,
 product_line_product_group)
VALUES (1, '000001', '01-23', 'describe 01-23', 3),
       (2, '000002', '02-33', 'describe 02-33', 3),
       (3, '000003', 'S-12', 'describe S-12', 1),
       (4, '000004', 'S-74', 'describe S-74', 1),
       (5, '000005', '05-17', 'describe 05-17', 4),
       (6, '000006', 'R15', 'describe R15', 2);

/*  */
INSERT INTO tech.product_recipe
(product_recipe_id,
 product_recipe_product_line,
 product_recipe_describe)
VALUES (1, 1, 'describe'),
       (2, 1, ''),
       (3, 1, 'describe'),
       (1, 2, ''),
       (2, 2, 'describe'),
       (1, 3, ''),
       (2, 3, ''),
       (3, 3, 'describe'),
       (4, 3, ''),
       (5, 3, ''),
       (4, 1, 'describe'),
       (5, 1, 'describe'),
       (1, 5, 'describe'),
       (1, 6, ''),
       (3, 2, ''),
       (1, 4, 'describe'),
       (2, 6, '');

/*  */
INSERT INTO tech.material_quality_level
(quality_level_id,
 quality_level_code,
 quality_level_rank)
VALUES (1, 'I cat.', 1),
       (2, 'II cat.', 2),
       (3, 'III cat.', 3),
       (4, 'IV cat.', 4),
       (5, 'V cat.', 5),
       (6, 'VI cat.', 6);

/*  */
INSERT INTO tech.product_recipe_composed
(product_recipe_id,
 product_recipe_product_line,
 product_recipe_cost_elements,
 product_recipe_composed_shape,
 product_recipe_cost_elements_quality_level)
VALUES (1, 1, 2000, 0.5, 2),
       (1, 1, 1000, 0.5, 1),
       (2, 1, 2000, 1, 2),
       (4, 3, 2000, 0.5, 3),
       (4, 3, 3300, 0.45, 1),
       (4, 3, 0100, 0.05, null),
       (1, 5, 2000, 0.5, 5),
       (1, 5, 3000, 0.45, 1),
       (1, 5, 0100, 0.025, null),
       (1, 5, 0010, 0.025, null),
       (3, 1, 1000, 0.99, 3),
       (3, 1, 0100, 0.01, null);




