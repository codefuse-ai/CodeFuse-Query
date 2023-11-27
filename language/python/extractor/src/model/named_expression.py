# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class NamedExpression(Base):
    __tablename__ = "named_expression"

    element_oid = Column(Integer, primary_key=True)
    target_oid = Column(Integer, nullable=False)
    value_oid = Column(Integer, nullable=False)
