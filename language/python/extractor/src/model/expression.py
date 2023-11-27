# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Expression(Base):
    __tablename__ = "expression"

    element_oid = Column(Integer, primary_key=True)
    type = Column(Text, nullable=False)
    element_index = Column(Integer, nullable=False)
    parent_oid = Column(Integer, nullable=False)
    location_oid = Column(Integer, nullable=False)
    printable_text = Column(Text, nullable=False)
