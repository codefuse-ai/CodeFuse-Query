# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Cmpop(Base):
    __tablename__ = "cmpop"

    element_oid = Column(Integer, primary_key=True)
    value = Column(Integer, nullable=False)
    location_oid = Column(Integer, nullable=False)
    parent_oid = Column(Integer, nullable=False)
