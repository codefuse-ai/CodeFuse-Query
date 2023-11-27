# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class SliceExpression(Base):
    __tablename__ = "slice_expression"

    element_oid = Column(Integer, primary_key=True)
    lower = Column(Integer)
    step = Column(Integer)
    upper = Column(Integer)
