package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.96f, 6.17f)
                curveTo(18.96f, 7.56f, 20.34f, 9.77f, 20.62f, 12.32f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.49f, 12.37f)
                curveTo(3.75f, 9.83f, 5.11f, 7.62f, 7.09f, 6.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.19f, 20.9399f)
                curveTo(9.35f, 21.5299f, 10.67f, 21.8599f, 12.06f, 21.8599f)
                curveTo(13.4f, 21.8599f, 14.66f, 21.5599f, 15.79f, 21.0099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.06f, 7.7f)
                curveTo(13.5954f, 7.7f, 14.84f, 6.4554f, 14.84f, 4.92f)
                curveTo(14.84f, 3.3847f, 13.5954f, 2.14f, 12.06f, 2.14f)
                curveTo(10.5247f, 2.14f, 9.28f, 3.3847f, 9.28f, 4.92f)
                curveTo(9.28f, 6.4554f, 10.5247f, 7.7f, 12.06f, 7.7f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.83f, 19.92f)
                curveTo(6.3653f, 19.92f, 7.61f, 18.6753f, 7.61f, 17.14f)
                curveTo(7.61f, 15.6046f, 6.3653f, 14.36f, 4.83f, 14.36f)
                curveTo(3.2946f, 14.36f, 2.05f, 15.6046f, 2.05f, 17.14f)
                curveTo(2.05f, 18.6753f, 3.2946f, 19.92f, 4.83f, 19.92f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.17f, 19.92f)
                curveTo(20.7054f, 19.92f, 21.95f, 18.6753f, 21.95f, 17.14f)
                curveTo(21.95f, 15.6046f, 20.7054f, 14.36f, 19.17f, 14.36f)
                curveTo(17.6347f, 14.36f, 16.39f, 15.6046f, 16.39f, 17.14f)
                curveTo(16.39f, 18.6753f, 17.6347f, 19.92f, 19.17f, 19.92f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
