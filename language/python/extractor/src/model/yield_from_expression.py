# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class YieldFromExpression(Base):
    __tablename__ = "yield_from_expression"

    element_oid = Column(Integer, primary_key=True)
    value = Column(Integer, nullable=False)
