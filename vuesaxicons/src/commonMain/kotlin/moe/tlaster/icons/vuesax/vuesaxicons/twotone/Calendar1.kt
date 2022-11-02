package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Calendar1: ImageVector
    get() {
        if (_calendar1 != null) {
            return _calendar1!!
        }
        _calendar1 = Builder(name = "Calendar1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                verticalLineTo(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                verticalLineTo(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.5f)
                curveTo(19.33f, 3.68f, 21.0f, 4.95f, 21.0f, 9.65f)
                verticalLineTo(15.83f)
                curveTo(21.0f, 19.95f, 20.0f, 22.01f, 15.0f, 22.01f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.01f, 3.0f, 19.95f, 3.0f, 15.83f)
                verticalLineTo(9.65f)
                curveTo(3.0f, 4.95f, 4.67f, 3.69f, 8.0f, 3.5f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 17.6001f)
                horizontalLineTo(3.25f)
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.25f)
                curveTo(10.77f, 8.25f, 9.73f, 8.92f, 9.73f, 10.22f)
                curveTo(9.73f, 10.84f, 10.02f, 11.31f, 10.46f, 11.61f)
                curveTo(9.85f, 11.97f, 9.5f, 12.55f, 9.5f, 13.23f)
                curveTo(9.5f, 14.47f, 10.45f, 15.24f, 12.0f, 15.24f)
                curveTo(13.54f, 15.24f, 14.5f, 14.47f, 14.5f, 13.23f)
                curveTo(14.5f, 12.55f, 14.15f, 11.96f, 13.53f, 11.61f)
                curveTo(13.98f, 11.3f, 14.26f, 10.84f, 14.26f, 10.22f)
                curveTo(14.26f, 8.92f, 13.23f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(12.0f, 11.09f)
                curveTo(11.48f, 11.09f, 11.1f, 10.78f, 11.1f, 10.29f)
                curveTo(11.1f, 9.79f, 11.48f, 9.5f, 12.0f, 9.5f)
                curveTo(12.52f, 9.5f, 12.9f, 9.79f, 12.9f, 10.29f)
                curveTo(12.9f, 10.78f, 12.52f, 11.09f, 12.0f, 11.09f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(11.34f, 14.0f, 10.86f, 13.67f, 10.86f, 13.07f)
                curveTo(10.86f, 12.47f, 11.34f, 12.15f, 12.0f, 12.15f)
                curveTo(12.66f, 12.15f, 13.14f, 12.48f, 13.14f, 13.07f)
                curveTo(13.14f, 13.67f, 12.66f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _calendar1!!
    }

private var _calendar1: ImageVector? = null
