# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class TupleExpression(Base):
    __tablename__ = "tuple_expression"

    element_oid = Column(Integer, primary_key=True)
    elt_size = Column(Integer, nullable=False)
    ctx = Column(Text, nullable=False)
