# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Module(Base):
    __tablename__ = "module"

    element_oid = Column(Integer, primary_key=True)
    name = Column(Text, nullable=False)
    file_oid = Column(Integer, nullable=False)
    location_oid = Column(Integer, nullable=False)
