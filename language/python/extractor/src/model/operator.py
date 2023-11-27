# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Operator(Base):
    __tablename__ = "operator"

    element_oid = Column(Integer, primary_key=True)
    location_oid = Column(Integer)
    parent_oid = Column(Integer)
    printable_text = Column(Text)
