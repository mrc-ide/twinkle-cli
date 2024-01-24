CREATE TABLE app
(
    name TEXT NOT NULL PRIMARY KEY,
    repo TEXT NOT NULL
);

CREATE TABLE admin_users
(
    app_name TEXT NOT NULL,
    user TEXT NOT NULL,
    FOREIGN KEY (app_name) REFERENCES app (name)
);