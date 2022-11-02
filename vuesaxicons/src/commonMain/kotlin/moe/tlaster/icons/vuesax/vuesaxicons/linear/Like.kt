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

public val LinearGroup.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.28f, 14.96f)
                curveTo(12.13f, 15.01f, 11.88f, 15.01f, 11.72f, 14.96f)
                curveTo(10.42f, 14.51f, 7.5f, 12.66f, 7.5f, 9.51f)
                curveTo(7.5f, 8.12f, 8.62f, 7.0f, 10.0f, 7.0f)
                curveTo(10.82f, 7.0f, 11.54f, 7.39f, 12.0f, 8.0f)
                curveTo(12.46f, 7.39f, 13.18f, 7.0f, 14.0f, 7.0f)
                curveTo(15.38f, 7.0f, 16.5f, 8.12f, 16.5f, 9.51f)
                curveTo(16.49f, 12.66f, 13.58f, 14.51f, 12.28f, 14.96f)
                close()
            }
        }
        .build()
        return _like!!
    }

private var _like: ImageVector? = null
