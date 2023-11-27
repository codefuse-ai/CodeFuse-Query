# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class SetCompExpression(Base):
    __tablename__ = "set_comp_expression"

    element_oid = Column(Integer, primary_key=True)
    elt_oid = Column(Integer, nullable=False)
    generator_size = Column(Integer, nullable=False)
