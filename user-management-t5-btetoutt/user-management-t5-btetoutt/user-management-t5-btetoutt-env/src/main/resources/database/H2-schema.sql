/* define the schemas. */
CREATE TABLE t_user(
    userid varchar(128),
    username varchar(128),
    birthday varchar(128),
    address varchar(128),
    telnumber varchar(128),
    password varchar(60),
    status varchar(128),
    finalupdate varchar(128),
    constraint pk_tbl_t_user primary key (userid)
);

CREATE TABLE t_role(
    userid varchar(128),
    userrole varchar(128),
);