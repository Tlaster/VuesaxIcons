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

public val BrokenGroup.Taguser: ImageVector
    get() {
        if (_taguser != null) {
            return _taguser!!
        }
        _taguser = Builder(name = "Taguser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 8.95f)
                verticalLineTo(15.88f)
                curveTo(21.0f, 17.52f, 19.66f, 18.85f, 18.0f, 18.85f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.85f, 15.68f, 19.16f, 15.12f, 19.72f)
                lineTo(13.41f, 21.41f)
                curveTo(12.63f, 22.18f, 11.36f, 22.18f, 10.58f, 21.41f)
                lineTo(8.87f, 19.72f)
                curveTo(8.31f, 19.16f, 7.54f, 18.85f, 6.75f, 18.85f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.85f, 3.0f, 17.52f, 3.0f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(3.0f, 3.33f, 4.34f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.0f, 21.0f, 3.33f, 21.0f, 4.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0691f, 8.9501f)
                curveTo(12.0291f, 8.9501f, 11.9691f, 8.9501f, 11.9191f, 8.9501f)
                curveTo(10.8691f, 8.9101f, 10.0391f, 8.0601f, 10.0391f, 7.0001f)
                curveTo(10.0391f, 5.9201f, 10.9091f, 5.05f, 11.9891f, 5.05f)
                curveTo(13.0691f, 5.05f, 13.9391f, 5.93f, 13.9391f, 7.0001f)
                curveTo(13.9491f, 8.0601f, 13.1191f, 8.92f, 12.0691f, 8.9501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 15.1901f)
                curveTo(10.76f, 16.2001f, 13.24f, 16.2001f, 14.75f, 15.1901f)
                curveTo(16.08f, 14.3001f, 16.08f, 12.8501f, 14.75f, 11.9601f)
                curveTo(13.24f, 10.9501f, 10.76f, 10.9501f, 9.25f, 11.9601f)
            }
        }
        .build()
        return _taguser!!
    }

private var _taguser: ImageVector? = null
