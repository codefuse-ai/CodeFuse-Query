# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class SubscriptExpression(Base):
    __tablename__ = "subscript_expression"

    element_oid = Column(Integer, primary_key=True)
    value_oid = Column(Integer, nullable=False)
    slice_oid = Column(Integer, nullable=False)
    ctx = Column(Text, nullable=False)
