package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.5901f, 19.3601f)
                curveTo(19.1401f, 18.5201f, 19.3401f, 18.1001f, 19.7601f, 17.1601f)
                curveTo(16.6801f, 15.9901f, 16.1801f, 11.6001f, 19.2301f, 9.9201f)
                curveTo(18.3001f, 8.7501f, 16.9901f, 8.0801f, 15.7601f, 8.0801f)
                curveTo(14.8701f, 8.0801f, 14.2601f, 8.3101f, 13.7101f, 8.5201f)
                curveTo(13.2501f, 8.7001f, 12.8201f, 8.8601f, 12.3101f, 8.8601f)
                curveTo(11.7501f, 8.8601f, 11.2601f, 8.6801f, 10.7401f, 8.5001f)
                curveTo(10.1701f, 8.3001f, 9.5801f, 8.0801f, 8.8401f, 8.0801f)
                curveTo(7.4501f, 8.0801f, 5.9801f, 8.9301f, 5.0401f, 10.3701f)
                curveTo(3.7301f, 12.4101f, 3.9501f, 16.2401f, 6.0801f, 19.5101f)
                curveTo(6.8401f, 20.6801f, 7.8601f, 21.9901f, 9.1901f, 22.0001f)
                curveTo(9.7401f, 22.0101f, 10.1101f, 21.8401f, 10.5101f, 21.6601f)
                curveTo(10.9701f, 21.4601f, 11.4601f, 21.2301f, 12.3201f, 21.2301f)
                curveTo(13.1801f, 21.2201f, 13.6701f, 21.4501f, 14.1201f, 21.6601f)
                curveTo(14.5101f, 21.8401f, 14.8701f, 22.0001f, 15.4101f, 22.0001f)
                curveTo(16.7501f, 21.9901f, 17.8301f, 20.5301f, 18.5901f, 19.3601f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0104f, 2.0698f)
                curveTo(16.1704f, 3.1698f, 15.7204f, 4.2598f, 15.1304f, 5.0198f)
                curveTo(14.5004f, 5.8398f, 13.4004f, 6.4798f, 12.3404f, 6.4398f)
                curveTo(12.1504f, 5.3798f, 12.6404f, 4.2898f, 13.2404f, 3.5598f)
                curveTo(13.9104f, 2.7598f, 15.0404f, 2.1398f, 16.0104f, 2.0698f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
