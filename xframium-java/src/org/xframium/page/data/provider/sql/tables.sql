drop table PERFECTO_PAGE_DATA_TYPE;
drop table PERFECTO_PAGE_DATA;
drop table PERFECTO_PAGE_DATA_ATTRS;

create table PERFECTO_PAGE_DATA_TYPE
(
        NAME VARCHAR(50) NOT NULL,
        LOCK_RECORDS VARCHAR(1),
        CONSTRAINT CHK_LOCK_RECORDS CHECK (LOCK_RECORDS IN ( 'Y', 'N' ))
);

create table PERFECTO_PAGE_DATA 
(
        TYPE_NAME VARCHAR(50) NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        ACTIVE VARCHAR(1),
        CONSTRAINT CHK_ACTIVE_2 CHECK (ACTIVE IN ( 'Y', 'N' ))
);

create table PERFECTO_PAGE_DATA_ATTRS
(
        TYPE_NAME VARCHAR(50) NOT NULL,
        RECORD_NAME VARCHAR(50) NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        VALUE VARCHAR(1000) NOT NULL
);


