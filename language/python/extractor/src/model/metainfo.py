# coding: utf-8
from sqlalchemy import Column, Integer, MetaData, Table, Text

metadata = MetaData()


t_metainfo = Table(
    "metainfo",
    metadata,
    Column("oid", Integer),
    Column("kind", Text),
    Column("value", Text),
    Column("program_oid", Integer),
)
