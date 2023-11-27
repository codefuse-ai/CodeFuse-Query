# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Mod(Base):
    __tablename__ = "mod"

    element_oid = Column(Integer, primary_key=True)
    type = Column(Text, nullable=False)
    location_oid = Column(Integer, nullable=False)
