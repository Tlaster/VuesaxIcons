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

public val TwotoneGroup.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0091f, 17.9998f)
                lineTo(2.9991f, 13.9898f)
                curveTo(1.6591f, 12.6498f, 1.6591f, 11.3198f, 2.9991f, 9.9798f)
                lineTo(9.6791f, 3.2998f)
                lineTo(17.0291f, 10.6498f)
                curveTo(17.3991f, 11.0198f, 17.3991f, 11.6198f, 17.0291f, 11.9898f)
                lineTo(11.0091f, 18.0098f)
                curveTo(9.6891f, 19.3298f, 8.3491f, 19.3298f, 7.0091f, 17.9998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3496f, 1.9502f)
                lineTo(9.6896f, 3.2902f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0703f, 11.9197f)
                lineTo(17.1903f, 11.2598f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.85f, 15.0f)
                curveTo(18.85f, 15.0f, 17.0f, 17.01f, 17.0f, 18.24f)
                curveTo(17.0f, 19.26f, 17.83f, 20.09f, 18.85f, 20.09f)
                curveTo(19.87f, 20.09f, 20.7f, 19.26f, 20.7f, 18.24f)
                curveTo(20.7f, 17.01f, 18.85f, 15.0f, 18.85f, 15.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
