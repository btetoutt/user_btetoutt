/* define the schemas. */
CREATE TABLE t_user(
    user_id varchar(128),
    user_name varchar(128),
    birth_day varchar(128),
    address varchar(128),
    tel_bng varchar(128),
    password varchar(60),
    status varchar(128),
    final_update varchar(128),
    constraint pk_tbl_t_user primary key (user_id)
);

CREATE TABLE account(
    username varchar(128),
    password varchar(60),
    first_name varchar(128),
    last_name varchar(128),
    constraint pk_tbl_account primary key (username)
);