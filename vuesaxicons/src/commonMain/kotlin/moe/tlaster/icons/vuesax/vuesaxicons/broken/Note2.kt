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

public val BrokenGroup.Note2: ImageVector
    get() {
        if (_note2 != null) {
            return _note2!!
        }
        _note2 = Builder(name = "Note2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0603f, 19.3901f)
                curveTo(14.4403f, 19.8101f, 13.6603f, 20.1601f, 12.7103f, 20.4701f)
                lineTo(11.1303f, 20.9901f)
                curveTo(7.1603f, 22.2701f, 5.0703f, 21.2001f, 3.7803f, 17.2301f)
                lineTo(2.5003f, 13.2801f)
                curveTo(1.2203f, 9.3101f, 2.2803f, 7.2101f, 6.2503f, 5.9301f)
                lineTo(7.8303f, 5.4101f)
                curveTo(8.2403f, 5.2801f, 8.6303f, 5.1701f, 9.0003f, 5.1001f)
                curveTo(8.7003f, 5.7101f, 8.4603f, 6.4501f, 8.2603f, 7.3001f)
                lineTo(7.2803f, 11.4901f)
                curveTo(6.3003f, 15.6701f, 7.5903f, 17.7301f, 11.7603f, 18.7201f)
                lineTo(13.4403f, 19.1201f)
                curveTo(14.0203f, 19.2601f, 14.5603f, 19.3501f, 15.0603f, 19.3901f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6406f, 8.53f)
                lineTo(17.4906f, 9.76f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6602f, 12.3999f)
                lineTo(14.5602f, 13.1399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9602f, 5.1f)
                curveTo(22.0402f, 6.3f, 22.2302f, 8.02f, 21.6602f, 10.44f)
                lineTo(20.6802f, 14.62f)
                curveTo(19.8402f, 18.23f, 18.1802f, 19.69f, 15.0602f, 19.39f)
                curveTo(14.5602f, 19.35f, 14.0202f, 19.26f, 13.4402f, 19.12f)
                lineTo(11.7602f, 18.72f)
                curveTo(7.5902f, 17.73f, 6.3002f, 15.67f, 7.2802f, 11.49f)
                lineTo(8.2602f, 7.3f)
                curveTo(8.4602f, 6.45f, 8.7002f, 5.71f, 9.0002f, 5.1f)
                curveTo(10.1702f, 2.68f, 12.1602f, 2.03f, 15.5002f, 2.82f)
                lineTo(17.1702f, 3.21f)
            }
        }
        .build()
        return _note2!!
    }

private var _note2: ImageVector? = null
