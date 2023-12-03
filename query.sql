CREATE TABLE t_user
(
    iuser INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    uid VARCHAR(25) UNIQUE NOT NULL,
    upw VARCHAR(300) NOT NULL,
    nm VARCHAR(25) NOT NULL,
    pic VARCHAR(2000),
    created_at DATETIME NOT NULL DEFAULT NOW(),
    updated_at DATETIME ON UPDATE NOW()
);

DESC t_user;

CREATE TABLE t_feed
(
    ifeed INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    iuser INT UNSIGNED NOT NULL,
    contents VARCHAR(1000),
    location VARCHAR(30),
    created_at DATETIME NOT NULL DEFAULT NOW(),
    updated_at DATETIME ON UPDATE NOW(),
    FOREIGN KEY (iuser) REFERENCES t_user (iuser)
);

DESC t_feed;

CREATE TABLE t_feed_comment
(
    ifeed_comment UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    iuser INT UNSIGNED NOT NULL,
    ifeed INT UNSIGNED NOT NULL,
    COMMENT VARCHAR(500) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT NOW(),
    updated_at DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW(),
    FOREIGN KEY (iuser) REFERENCES t_user (iuser),
    FOREIGN KEY (ifeed) REFERENCES t_feed (ifeed)
);

DESC t_feed_comment;

CREATE TABLE t_feed_fav
(
    ifeed INT UNSIGNED NOT NULL,
    iuser INT UNSIGNED NOT NULL,
    created_at DATETIME NOT NULL DEFAULT NOW(),
    PRIMARY KEY (ifeed, iuser),
    FOREIGN KEY (ifeed) REFERENCES t_feed (ifeed),
    FOREIGN KEY (iuser) REFERENCES t_user (iuser)
);

DESC t_feed_fav;

CREATE TABLE t_feed_pics
(
    ifeed_pics INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ifeed INT UNSIGNED NOT NULL,
    pic VARCHAR(2500) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT NOW(),
    FOREIGN KEY (ifeed) REFERENCES t_feed (ifeed)
);

DESC t_feed_pics;