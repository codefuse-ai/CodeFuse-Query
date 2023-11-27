# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Location(Base):
    __tablename__ = "location"

    element_oid = Column(Integer, primary_key=True)
    file_oid = Column(Integer, nullable=False)
    start_line_number = Column(Integer, nullable=False)
    start_column_number = Column(Integer, nullable=False)
    end_line_number = Column(Integer, nullable=False)
    end_column_number = Column(Integer, nullable=False)
