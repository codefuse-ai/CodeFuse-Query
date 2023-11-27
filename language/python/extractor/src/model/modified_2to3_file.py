# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Modified2to3File(Base):
    __tablename__ = "modified_2to3_file"

    element_oid = Column(Integer, primary_key=True)
    relative_path = Column(Text, nullable=False)
