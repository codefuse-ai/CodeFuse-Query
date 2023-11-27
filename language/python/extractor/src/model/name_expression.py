# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class NameExpression(Base):
    __tablename__ = "name_expression"

    element_oid = Column(Integer, primary_key=True)
    ctx_type = Column(Text, nullable=False)
