# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Modifier(Base):
    __tablename__ = "modifier"

    element_oid = Column(Integer, primary_key=True)
    name = Column(Text)
    parent_oid = Column(Integer)
    location_oid = Column(Integer)
