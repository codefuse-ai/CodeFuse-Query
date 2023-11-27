# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ClassHierarchy(Base):
    __tablename__ = "class_hierarchy"

    base_oid = Column(Integer, primary_key=True)
    class_oid = Column(Integer, nullable=False)
