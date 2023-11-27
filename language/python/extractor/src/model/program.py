# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Program(Base):
    __tablename__ = "program"

    program_oid = Column(Integer, primary_key=True)
    absolute_prefix_path = Column(Text, nullable=False)
