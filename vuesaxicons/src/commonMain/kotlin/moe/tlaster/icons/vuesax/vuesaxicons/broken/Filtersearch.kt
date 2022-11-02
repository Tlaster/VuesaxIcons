package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Filtersearch: ImageVector
    get() {
        if (_filtersearch != null) {
            return _filtersearch!!
        }
        _filtersearch = Builder(name = "Filtersearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.3301f, 2.0f)
                horizontalLineTo(18.67f)
                curveTo(19.78f, 2.0f, 20.6901f, 2.91f, 20.6901f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.6901f, 7.05f, 20.1801f, 8.06f, 19.6801f, 8.56f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3206f, 19.0699f)
                curveTo(14.3206f, 19.6799f, 13.9205f, 20.4799f, 13.4105f, 20.7899f)
                lineTo(12.0005f, 21.7f)
                curveTo(10.6905f, 22.51f, 8.8705f, 21.5999f, 8.8705f, 19.9799f)
                verticalLineTo(14.6299f)
                curveTo(8.8705f, 13.9199f, 8.4705f, 13.0099f, 8.0605f, 12.5099f)
                lineTo(4.2205f, 8.4699f)
                curveTo(3.7105f, 7.9599f, 3.3105f, 7.0599f, 3.3105f, 6.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0692f, 16.5201f)
                curveTo(17.8365f, 16.5201f, 19.2692f, 15.0874f, 19.2692f, 13.3201f)
                curveTo(19.2692f, 11.5528f, 17.8365f, 10.1201f, 16.0692f, 10.1201f)
                curveTo(14.3018f, 10.1201f, 12.8691f, 11.5528f, 12.8691f, 13.3201f)
                curveTo(12.8691f, 15.0874f, 14.3018f, 16.5201f, 16.0692f, 16.5201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8691f, 17.1201f)
                lineTo(18.8691f, 16.1201f)
            }
        }
        .build()
        return _filtersearch!!
    }

private var _filtersearch: ImageVector? = null
