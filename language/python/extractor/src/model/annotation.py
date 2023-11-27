# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class Annotation(Base):
    __tablename__ = "annotation"

    element_oid = Column(Integer, primary_key=True)
    name = Column(Text, nullable=False)
    annotation_declaration_oid = Column(Integer, nullable=False)
    location_oid = Column(Integer, nullable=False)
    printable_text = Column(Text)
    parent_oid = Column(Integer)
