package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.9499f, 22.0f)
                lineTo(2.9999f, 9.97f)
                curveTo(2.9999f, 9.36f, 3.2899f, 8.78f, 3.7699f, 8.4f)
                lineTo(10.77f, 2.95f)
                curveTo(11.49f, 2.39f, 12.4999f, 2.39f, 13.2299f, 2.95f)
                lineTo(20.23f, 8.39f)
                curveTo(20.72f, 8.77f, 21.0f, 9.35f, 21.0f, 9.97f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(10.17f, 17.0f, 9.5f, 17.67f, 9.5f, 18.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.5f)
                curveTo(14.5f, 17.67f, 13.83f, 17.0f, 13.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 13.75f)
                horizontalLineTo(7.5f)
                curveTo(6.95f, 13.75f, 6.5f, 13.3f, 6.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(6.5f, 10.7f, 6.95f, 10.25f, 7.5f, 10.25f)
                horizontalLineTo(9.5f)
                curveTo(10.05f, 10.25f, 10.5f, 10.7f, 10.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(10.5f, 13.3f, 10.05f, 13.75f, 9.5f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 13.75f)
                horizontalLineTo(14.5f)
                curveTo(13.95f, 13.75f, 13.5f, 13.3f, 13.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(13.5f, 10.7f, 13.95f, 10.25f, 14.5f, 10.25f)
                horizontalLineTo(16.5f)
                curveTo(17.05f, 10.25f, 17.5f, 10.7f, 17.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(17.5f, 13.3f, 17.05f, 13.75f, 16.5f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0001f, 7.0f)
                lineTo(18.9701f, 4.0f)
                horizontalLineTo(14.5701f)
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
