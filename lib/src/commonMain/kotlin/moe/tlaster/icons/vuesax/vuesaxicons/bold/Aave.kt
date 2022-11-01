package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Aave: ImageVector
    get() {
        if (_aave != null) {
            return _aave!!
        }
        _aave = Builder(name = "Aave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.3f, 16.69f)
                curveTo(16.2f, 16.73f, 16.1f, 16.75f, 16.0f, 16.75f)
                curveTo(15.71f, 16.75f, 15.44f, 16.58f, 15.31f, 16.3f)
                lineTo(12.0f, 8.85f)
                lineTo(10.93f, 11.25f)
                horizontalLineTo(12.0f)
                curveTo(12.41f, 11.25f, 12.75f, 11.59f, 12.75f, 12.0f)
                curveTo(12.75f, 12.41f, 12.41f, 12.75f, 12.0f, 12.75f)
                horizontalLineTo(10.27f)
                lineTo(8.69f, 16.3f)
                curveTo(8.52f, 16.68f, 8.07f, 16.85f, 7.7f, 16.68f)
                curveTo(7.32f, 16.51f, 7.15f, 16.07f, 7.32f, 15.69f)
                lineTo(8.63f, 12.74f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 12.74f, 7.25f, 12.4f, 7.25f, 11.99f)
                curveTo(7.25f, 11.58f, 7.59f, 11.24f, 8.0f, 11.24f)
                horizontalLineTo(9.29f)
                lineTo(11.31f, 6.69f)
                curveTo(11.55f, 6.15f, 12.44f, 6.15f, 12.68f, 6.69f)
                lineTo(16.68f, 15.69f)
                curveTo(16.85f, 16.07f, 16.68f, 16.52f, 16.3f, 16.69f)
                close()
            }
        }
        .build()
        return _aave!!
    }

private var _aave: ImageVector? = null
