INSERT INTO allergens (id, name) VALUES
    (1, 'egg'),
    (2, 'milk'),
    (3, 'gluten');

INSERT INTO categories (id, name) VALUES
    (1, 'pizza');

INSERT INTO ingredients (id, name) VALUES
    (1, 'dough'),
    (2, 'mozzarella'),
    (3, 'gorgonzola'),
    (4, 'parmesan'),
    (5, 'goat cheese'),
    (6, 'tomato paste'),
    (7, 'pepper');

INSERT INTO products (id, name, description, grams, price, category_id) VALUES
    (1, 'Pizza Quattro Formaggi', 'Four-cheese pizza', 400, 28, 1);

INSERT INTO ingredients_allergens (ingredient_id, allergen_id) VALUES
    (1, 1),
    (1, 3),
    (2, 2),
    (3, 2),
    (4, 2),
    (5, 2);

INSERT INTO products_ingredients(product_id, ingredient_id) VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (1, 5),
    (1, 6),
    (1, 7);