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

public val LinearGroup.Verify: ImageVector
    get() {
        if (_verify != null) {
            return _verify!!
        }
        _verify = Builder(name = "Verify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.38f, 12.0f)
                lineTo(10.79f, 14.42f)
                lineTo(15.62f, 9.58f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.75f, 2.4499f)
                curveTo(11.44f, 1.8599f, 12.57f, 1.8599f, 13.27f, 2.4499f)
                lineTo(14.85f, 3.81f)
                curveTo(15.15f, 4.07f, 15.71f, 4.28f, 16.11f, 4.28f)
                horizontalLineTo(17.81f)
                curveTo(18.87f, 4.28f, 19.74f, 5.15f, 19.74f, 6.2099f)
                verticalLineTo(7.9099f)
                curveTo(19.74f, 8.2999f, 19.95f, 8.87f, 20.21f, 9.1699f)
                lineTo(21.57f, 10.7499f)
                curveTo(22.16f, 11.4399f, 22.16f, 12.5699f, 21.57f, 13.2699f)
                lineTo(20.21f, 14.8499f)
                curveTo(19.95f, 15.1499f, 19.74f, 15.7099f, 19.74f, 16.1099f)
                verticalLineTo(17.8099f)
                curveTo(19.74f, 18.8699f, 18.87f, 19.7399f, 17.81f, 19.7399f)
                horizontalLineTo(16.11f)
                curveTo(15.72f, 19.7399f, 15.15f, 19.9499f, 14.85f, 20.2099f)
                lineTo(13.27f, 21.5699f)
                curveTo(12.58f, 22.1599f, 11.45f, 22.1599f, 10.75f, 21.5699f)
                lineTo(9.17f, 20.2099f)
                curveTo(8.87f, 19.9499f, 8.31f, 19.7399f, 7.91f, 19.7399f)
                horizontalLineTo(6.18f)
                curveTo(5.12f, 19.7399f, 4.25f, 18.8699f, 4.25f, 17.8099f)
                verticalLineTo(16.0999f)
                curveTo(4.25f, 15.7099f, 4.04f, 15.1499f, 3.79f, 14.8499f)
                lineTo(2.44f, 13.2599f)
                curveTo(1.86f, 12.5699f, 1.86f, 11.4499f, 2.44f, 10.7599f)
                lineTo(3.79f, 9.1699f)
                curveTo(4.04f, 8.87f, 4.25f, 8.3099f, 4.25f, 7.92f)
                verticalLineTo(6.2f)
                curveTo(4.25f, 5.1399f, 5.12f, 4.2699f, 6.18f, 4.2699f)
                horizontalLineTo(7.91f)
                curveTo(8.3f, 4.2699f, 8.87f, 4.0599f, 9.17f, 3.7999f)
                lineTo(10.75f, 2.4499f)
                close()
            }
        }
        .build()
        return _verify!!
    }

private var _verify: ImageVector? = null
