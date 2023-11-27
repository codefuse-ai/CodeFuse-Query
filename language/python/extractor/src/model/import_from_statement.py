# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ImportFromStatement(Base):
    __tablename__ = "import_from_statement"

    element_oid = Column(Integer, primary_key=True)
    module = Column(Text, nullable=False)
    level = Column(Integer, nullable=False)
