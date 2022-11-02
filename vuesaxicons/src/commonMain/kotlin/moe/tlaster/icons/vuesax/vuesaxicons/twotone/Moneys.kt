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

public val TwotoneGroup.Moneys: ImageVector
    get() {
        if (_moneys != null) {
            return _moneys!!
        }
        _moneys = Builder(name = "Moneys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3009f, 7.92f)
                verticalLineTo(13.07f)
                curveTo(19.3009f, 16.15f, 17.5409f, 17.47f, 14.9009f, 17.47f)
                horizontalLineTo(6.1109f)
                curveTo(5.6609f, 17.47f, 5.2309f, 17.43f, 4.8309f, 17.34f)
                curveTo(4.5809f, 17.3f, 4.3409f, 17.23f, 4.1209f, 17.15f)
                curveTo(2.6209f, 16.59f, 1.7109f, 15.29f, 1.7109f, 13.07f)
                verticalLineTo(7.92f)
                curveTo(1.7109f, 4.84f, 3.4709f, 3.52f, 6.1109f, 3.52f)
                horizontalLineTo(14.9009f)
                curveTo(17.1409f, 3.52f, 18.7509f, 4.47f, 19.1809f, 6.64f)
                curveTo(19.2509f, 7.04f, 19.3009f, 7.45f, 19.3009f, 7.92f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3001f, 10.9201f)
                verticalLineTo(16.0701f)
                curveTo(22.3001f, 19.1501f, 20.5401f, 20.4701f, 17.9001f, 20.4701f)
                horizontalLineTo(9.1101f)
                curveTo(8.3701f, 20.4701f, 7.7001f, 20.3701f, 7.1201f, 20.1501f)
                curveTo(5.9301f, 19.7101f, 5.1201f, 18.8001f, 4.8301f, 17.3401f)
                curveTo(5.2301f, 17.4301f, 5.6601f, 17.4701f, 6.1101f, 17.4701f)
                horizontalLineTo(14.9001f)
                curveTo(17.5401f, 17.4701f, 19.3001f, 16.1501f, 19.3001f, 13.0701f)
                verticalLineTo(7.9201f)
                curveTo(19.3001f, 7.4501f, 19.2601f, 7.0301f, 19.1801f, 6.6401f)
                curveTo(21.0801f, 7.0401f, 22.3001f, 8.3801f, 22.3001f, 10.9201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4994f, 13.1399f)
                curveTo(11.9574f, 13.1399f, 13.1394f, 11.9579f, 13.1394f, 10.4999f)
                curveTo(13.1394f, 9.0419f, 11.9574f, 7.8599f, 10.4994f, 7.8599f)
                curveTo(9.0414f, 7.8599f, 7.8594f, 9.0419f, 7.8594f, 10.4999f)
                curveTo(7.8594f, 11.9579f, 9.0414f, 13.1399f, 10.4994f, 13.1399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7793f, 8.2998f)
                verticalLineTo(12.6998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2207f, 8.2998f)
                verticalLineTo(12.6998f)
            }
        }
        .build()
        return _moneys!!
    }

private var _moneys: ImageVector? = null
