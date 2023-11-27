# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ParseErrorFile(Base):
    __tablename__ = "parse_error_file"

    element_oid = Column(Integer, primary_key=True)
    relative_path = Column(Text, nullable=False)
    error_message = Column(Text, nullable=False)
    error_text = Column(Text, nullable=False)
