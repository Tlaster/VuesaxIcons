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

public val LinearGroup.Usertag: ImageVector
    get() {
        if (_usertag != null) {
            return _usertag!!
        }
        _usertag = Builder(name = "Usertag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.86f, 3.0f, 17.53f, 3.0f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3.0f, 3.34f, 4.34f, 2.01f, 6.0f, 2.01f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.01f, 21.0f, 3.34f, 21.0f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21.0f, 17.52f, 19.66f, 18.86f, 18.0f, 18.86f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9999f, 10.0001f)
                curveTo(13.2868f, 10.0001f, 14.33f, 8.9569f, 14.33f, 7.67f)
                curveTo(14.33f, 6.3832f, 13.2868f, 5.3401f, 11.9999f, 5.3401f)
                curveTo(10.7131f, 5.3401f, 9.6699f, 6.3832f, 9.6699f, 7.67f)
                curveTo(9.6699f, 8.9569f, 10.7131f, 10.0001f, 11.9999f, 10.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 15.6601f)
                curveTo(16.0f, 13.8601f, 14.21f, 12.4001f, 12.0f, 12.4001f)
                curveTo(9.79f, 12.4001f, 8.0f, 13.8601f, 8.0f, 15.6601f)
            }
        }
        .build()
        return _usertag!!
    }

private var _usertag: ImageVector? = null
