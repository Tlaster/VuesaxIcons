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

public val TwotoneGroup.Volumeslash: ImageVector
    get() {
        if (_volumeslash != null) {
            return _volumeslash!!
        }
        _volumeslash = Builder(name = "Volumeslash", defaultWidth = 22.0.dp, defaultHeight =
                22.0.dp, viewportWidth = 22.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 7.3698f)
                verticalLineTo(6.4098f)
                curveTo(14.0f, 3.4298f, 11.93f, 2.2898f, 9.41f, 3.8698f)
                lineTo(6.49f, 5.6998f)
                curveTo(6.17f, 5.8898f, 5.8f, 5.9998f, 5.43f, 5.9998f)
                horizontalLineTo(4.0f)
                curveTo(2.0f, 5.9998f, 1.0f, 6.9998f, 1.0f, 8.9998f)
                verticalLineTo(12.9998f)
                curveTo(1.0f, 14.9998f, 2.0f, 15.9998f, 4.0f, 15.9998f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4102f, 18.1302f)
                curveTo(11.9302f, 19.7102f, 14.0002f, 18.5602f, 14.0002f, 15.5902f)
                verticalLineTo(11.9502f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.81f, 8.4199f)
                curveTo(18.71f, 10.5699f, 18.44f, 13.0799f, 17.0f, 14.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1501f, 6.7998f)
                curveTo(21.6201f, 10.2898f, 21.1801f, 14.3698f, 18.8301f, 17.4998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                lineTo(1.0f, 21.0f)
            }
        }
        .build()
        return _volumeslash!!
    }

private var _volumeslash: ImageVector? = null
