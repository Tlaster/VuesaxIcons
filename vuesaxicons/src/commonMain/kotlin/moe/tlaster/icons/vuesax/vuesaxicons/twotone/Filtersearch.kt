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

public val TwotoneGroup.Filtersearch: ImageVector
    get() {
        if (_filtersearch != null) {
            return _filtersearch!!
        }
        _filtersearch = Builder(name = "Filtersearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3206f, 19.0698f)
                curveTo(14.3206f, 19.6798f, 13.9205f, 20.4798f, 13.4105f, 20.7898f)
                lineTo(12.0005f, 21.6998f)
                curveTo(10.6905f, 22.5098f, 8.8705f, 21.5998f, 8.8705f, 19.9798f)
                verticalLineTo(14.6298f)
                curveTo(8.8705f, 13.9198f, 8.4705f, 13.0098f, 8.0605f, 12.5098f)
                lineTo(4.2205f, 8.4698f)
                curveTo(3.7105f, 7.9598f, 3.3105f, 7.0598f, 3.3105f, 6.4498f)
                verticalLineTo(4.1298f)
                curveTo(3.3105f, 2.9198f, 4.2206f, 2.0098f, 5.3306f, 2.0098f)
                horizontalLineTo(18.6705f)
                curveTo(19.7805f, 2.0098f, 20.6906f, 2.9197f, 20.6906f, 4.0297f)
                verticalLineTo(6.2498f)
                curveTo(20.6906f, 7.0598f, 20.1805f, 8.0698f, 19.6805f, 8.5698f)
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
