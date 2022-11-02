package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Documentcopy: ImageVector
    get() {
        if (_documentcopy != null) {
            return _documentcopy!!
        }
        _documentcopy = Builder(name = "Documentcopy", defaultWidth = 22.0.dp, defaultHeight =
                22.0.dp, viewportWidth = 22.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.4f)
                verticalLineTo(15.4f)
                curveTo(16.0f, 19.4f, 14.4f, 21.0f, 10.4f, 21.0f)
                horizontalLineTo(6.6f)
                curveTo(2.6f, 21.0f, 1.0f, 19.4f, 1.0f, 15.4f)
                verticalLineTo(11.6f)
                curveTo(1.0f, 7.6f, 2.6f, 6.0f, 6.6f, 6.0f)
                horizontalLineTo(9.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9996f, 12.4f)
                horizontalLineTo(12.7996f)
                curveTo(10.3996f, 12.4f, 9.5996f, 11.6f, 9.5996f, 9.2f)
                verticalLineTo(6.0f)
                lineTo(15.9996f, 12.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(6.0f, 2.34f, 7.34f, 1.0f, 9.0f, 1.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9995f, 7.0f)
                verticalLineTo(13.19f)
                curveTo(20.9995f, 14.74f, 19.7395f, 16.0f, 18.1895f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(15.75f, 7.0f, 15.0f, 6.25f, 15.0f, 4.0f)
                verticalLineTo(1.0f)
                lineTo(21.0f, 7.0f)
                close()
            }
        }
        .build()
        return _documentcopy!!
    }

private var _documentcopy: ImageVector? = null
