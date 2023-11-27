# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class GeneratorExpression(Base):
    __tablename__ = "generator_expression"

    element_oid = Column(Integer, primary_key=True)
    elt_oid = Column(Integer, nullable=False)
