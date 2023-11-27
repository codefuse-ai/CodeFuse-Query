# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class DictCompExpression(Base):
    __tablename__ = "dict_comp_expression"

    element_oid = Column(Integer, primary_key=True)
    comprehension_size = Column(Integer, nullable=False)
