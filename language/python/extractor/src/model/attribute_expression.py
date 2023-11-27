# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AttributeExpression(Base):
    __tablename__ = "attribute_expression"

    element_oid = Column(Integer, primary_key=True)
    value_oid = Column(Integer, nullable=False)
    ctx_type = Column(Text, nullable=False)
