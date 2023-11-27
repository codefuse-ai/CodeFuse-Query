# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class File(Base):
    __tablename__ = "file"

    element_oid = Column(Integer, primary_key=True)
    relative_path = Column(Text, nullable=False)
    extension = Column(Text, nullable=False)
    name = Column(Text, nullable=False)
    number_of_lines_oid = Column(Integer, nullable=False)
