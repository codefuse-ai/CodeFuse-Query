# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Pattern(Base):
    __tablename__ = "pattern"

    element_oid = Column(Integer, primary_key=True)
    value = Column(Text)
    location_oid = Column(Integer)
    parent_oid = Column(Integer)
