DROP TABLE IF EXISTS m_user;

CREATE TABLE m_user (
                       id integer not null primary key,
                       name varchar(80) not null
);

INSERT INTO m_user (id, name) values(1, 'Test User1');
INSERT INTO m_user (id, name) values(2, 'Test User2');
INSERT INTO m_user (id, name) values(3, 'Test User3');

DROP TABLE IF EXISTS m_todo;

CREATE TABLE `m_todo` (
                          `id` bigint NOT NULL AUTO_INCREMENT,
                          `title` varchar(255) NOT NULL DEFAULT '',
                          `completed` tinyint NOT NULL DEFAULT '0',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

