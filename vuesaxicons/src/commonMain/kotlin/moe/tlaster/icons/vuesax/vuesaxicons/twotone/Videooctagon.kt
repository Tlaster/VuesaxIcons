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

public val TwotoneGroup.Videooctagon: ImageVector
    get() {
        if (_videooctagon != null) {
            return _videooctagon!!
        }
        _videooctagon = Builder(name = "Videooctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0801f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.0801f, 16.54f, 20.4802f, 17.58f, 19.5102f, 18.15f)
                lineTo(13.5702f, 21.58f)
                curveTo(12.6002f, 22.14f, 11.4002f, 22.14f, 10.4202f, 21.58f)
                lineTo(4.4802f, 18.15f)
                curveTo(3.5102f, 17.59f, 2.9102f, 16.55f, 2.9102f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.9102f, 7.46f, 3.5102f, 6.42f, 4.4802f, 5.85f)
                lineTo(10.4202f, 2.42f)
                curveTo(11.3902f, 1.86f, 12.5902f, 1.86f, 13.5702f, 2.42f)
                lineTo(19.5102f, 5.85f)
                curveTo(20.4802f, 6.42f, 21.0801f, 7.45f, 21.0801f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 11.9999f)
                verticalLineTo(10.7999f)
                curveTo(9.75f, 9.2599f, 10.84f, 8.6299f, 12.17f, 9.3999f)
                lineTo(13.21f, 9.9999f)
                lineTo(14.25f, 10.5999f)
                curveTo(15.58f, 11.3699f, 15.58f, 12.6299f, 14.25f, 13.3999f)
                lineTo(13.21f, 13.9999f)
                lineTo(12.17f, 14.5999f)
                curveTo(10.84f, 15.3699f, 9.75f, 14.7399f, 9.75f, 13.1999f)
                verticalLineTo(11.9999f)
                close()
            }
        }
        .build()
        return _videooctagon!!
    }

private var _videooctagon: ImageVector? = null
