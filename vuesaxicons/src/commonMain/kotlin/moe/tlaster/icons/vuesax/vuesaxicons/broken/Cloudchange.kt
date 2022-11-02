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

public val BrokenGroup.Cloudchange: ImageVector
    get() {
        if (_cloudchange != null) {
            return _cloudchange!!
        }
        _cloudchange = Builder(name = "Cloudchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2883f, 9.98f)
                curveTo(14.3583f, 4.34f, 6.2083f, 6.48f, 8.1383f, 11.85f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1093f, 11.85f)
                curveTo(5.2893f, 12.05f, 5.2993f, 16.15f, 8.1093f, 16.35f)
                horizontalLineTo(14.7793f)
                curveTo(15.5893f, 16.36f, 16.3693f, 16.05f, 16.9693f, 15.51f)
                curveTo(17.7393f, 14.84f, 18.0493f, 13.91f, 17.9893f, 13.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 18.87f, 5.13f, 22.0f, 9.0f, 22.0f)
                lineTo(7.95f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f)
                lineTo(16.05f, 3.75f)
            }
        }
        .build()
        return _cloudchange!!
    }

private var _cloudchange: ImageVector? = null
