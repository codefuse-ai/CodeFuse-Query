# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Folder(Base):
    __tablename__ = "folder"

    element_oid = Column(Integer, primary_key=True)
    qualified_name = Column(Text, nullable=False)
    name = Column(Text, nullable=False)
    parent_oid = Column(Integer, nullable=False)
